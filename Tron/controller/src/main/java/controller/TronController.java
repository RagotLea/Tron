package controller;

import java.util.ArrayList;

import model.Direction;
import model.IGrid;
import model.ILightCycles;
import model.ITronModel;
import view.IViewSystem;

public class TronController implements IOrderPerformer{
	private static int						TIME_SLEEP	= 30;
	private final ITronModel	tronModel;
	private boolean								isGameOver	= false;
	private IViewSystem	viewSystem;
	private IGrid grid;

	public TronController(final ITronModel tronModel) {
		this.tronModel = tronModel;
	}

	@Override
	public void orderPerform(final IUserOrder userOrder) {
		if (userOrder != null) {
			final ILightCycles lightCycles = this.grid.getMobileByPlayer(userOrder.getPlayer());
			if (lightCycles != null) {
				Direction direction;
				switch (userOrder.getOrder()) {
					/*case UP:
						direction = Direction.UP;
						break;*/
					case RIGHT:
						lightCycles.turnRight();
						direction = lightCycles.getDirection();
						break;
					/*case DOWN:
						direction = Direction.DOWN;
						break;*/
					case LEFT:
						lightCycles.turnLeft();
						direction = lightCycles.getDirection();
						break;
					default:
						direction = this.grid.getMobileByPlayer(userOrder.getPlayer()).getDirection();
						break;
				}
				lightCycles.setDirection(direction);
			}
		}
	}

	private boolean isWeaponOnMobile(final ILightCycles lightCycles1, final ILightCycles lightCycles2) {
		if (((lightCycles2.getPosition().getX() / lightCycles2.getWidth()) >= (lightCycles1.getPosition().getX() / lightCycles2.getWidth()))
				&& ((lightCycles2.getPosition().getX() / lightCycles2.getWidth()) <= ((lightCycles1.getPosition().getX() + lightCycles1.getWidth()) / lightCycles1.getWidth()))) {
			if (((lightCycles2.getPosition().getY() / lightCycles2.getHeight()) >= (lightCycles1.getPosition().getY() / lightCycles2.getHeight()))
					&& ((lightCycles2.getPosition().getY() / lightCycles2.getHeight()) <= ((lightCycles1.getPosition().getY() + lightCycles1.getHeight()) / lightCycles1.getHeight()))) {
				return true;
			}
		}
		return false;
	}

	private void manageCollision(final ILightCycles weapon) {
		final ArrayList<ILightCycles> target = new ArrayList<ILightCycles>();
		boolean isTargetHit = false;

		for (final ILightCycles mobile : this.grid.getLightCycles()) {
			if (this.isWeaponOnMobile(mobile, weapon)) {
				target.add(mobile);
			}
		}
	/*for (final ILightCycles mobile : target) {
			isTargetHit = isTargetHit || mobile.hit();
		}
		if (isTargetHit) {
			this.isGameOver = true;
		}*/
	}

	public void play() {
		this.gameLoop();
		this.viewSystem.displayMessage("Game Over !");
		this.viewSystem.closeAll();
	}

	private void gameLoop() {
		while (!this.isGameOver) {
			try {
				Thread.sleep(TIME_SLEEP);
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			final ArrayList<ILightCycles> initialMobiles = new ArrayList<ILightCycles>();
			for (final ILightCycles mobile : this.grid.getLightCycles()) {
				initialMobiles.add(mobile);
			}
			for (final ILightCycles mobile : initialMobiles) {
				mobile.move();
				if (mobile.isWeapon()) {
					this.manageCollision(mobile);
				}
			}
			this.grid.setMobilesHavesMoved();
		}
	}

	public void setViewSystem(final IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
}
