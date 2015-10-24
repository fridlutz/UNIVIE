/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 * */
package at.ac.univie.swa.ase2015.a9902268.task1.model;

public class UnregisteredUser extends Role {

	public void changeMode(User me) {
		if (me.isEditor) {
			me.isEditor = false;
			me.isReader = true;
		}
		else {
			me.isEditor = true;
			me.isReader = false;
		}
	}
}
