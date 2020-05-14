package Barron_Homework;

import java.util.List;

public class Tournament {
	private Player[] slots;
	private List<String> WaitingList;

	public Player requestSlot(String playerName) {
		if (slots[slots.length - 1] == null) {
			int index = 0;
			while (slots[index] != null) {
				index++;
			}
			return slots[index] = new Player("playerName", index);
		} else {
			WaitingList.add(playerName);
		}
		return null;
	}

	/**
	 * Release the slot for player p, thus removing that player from the tournament.
	 * If there are any names in waitingList, remove the first name and create a
	 * Player in the canceled slot for this person. Return the new Player. If
	 * waitingList is empty, mark the slot specified by p as empty and return null.
	 * Precondition: p is a valid Player for some slot in this tournament.
	 * 
	 * @param p the player who will be removed from the tournament
	 * @return the new Player placed in the canceled slot
	 */
	public Player cancelAndReassignSlot(Player p) {
		int i = WaitingList.size();
		if (i > 0) {
			slots[i] = p;
			WaitingList.remove(0);
		}
		if (slots[i] == null) {
			return slots[i];
		}
		return p;
	}
	/**
	 * Release the slot for player p, thus removing that player from the tournament.
	 * If there are any names in waitingList, remove the first name and create a
	 * Player in the canceled slot for this person. Return the new Player. If
	 * waitingList is empty, mark the slot specified by p as empty and return null.
	 * Precondition: pisavalidPlayerforsomeslotin this tournament.
	 * 
	 * @param p the player who will be removed from the tournament
	 * @return the new Player placed in the canceled slot
	 */

}
