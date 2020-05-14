package Exam_2016;

public class LogMessage {
	private String machineId;
	private String description;

	/** Precondition: message is a valid log message. */
	public LogMessage(String message) {
		int index = message.indexOf(":");
		machineId = message.substring(0, index);
		description = message.substring(index + 1);
	}

	/**
	 * Returns true if the description in this log message properly contains
	 * keyword; false otherwise
	 */
	public boolean containsWord(String keyword) {
		if (description.substring(0,keyword.length()).equals(keyword)) {
			return true;
		}else if(description.substring(description.length()-keyword.length()).equals(keyword)){
			return true;
		}else {
			for(int i=1;i<keyword.length()-1;i++) {
				if (description.substring(i-1,i).equals(" ")) {
					if (description.substring(i,i+keyword.length()).equals(keyword)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}
}
// There may be instance variables, constructors, and methods that are not
// shown.
