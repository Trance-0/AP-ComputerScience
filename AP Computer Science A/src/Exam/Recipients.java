package Exam;

import java.util.List;

public class Recipients {
	/** The list of lines in the mailing list */
	private List<String> lines;

	/**
	 * Constructor. Fill lines with mailing list data. Postcondition: - Each element
	 * in lines is one line of the mailing list. - Lines appear in the list in the
	 * same order that they appear in the mailing list. - Blank line separators in
	 * the mailing list are stored as empty strings.
	 */
	public Recipients() {
		/* implementation not shown */ }

	/**
	 * Postcondition: Returns the city contained in the cityZip string of an
	 * address.
	 * 
	 * @param cityZip contains the city, state, and zipcode line of an address
	 * @return the city substring contained in cityZip
	 */
	public String extractCity(String cityZip) {
		int i = cityZip.indexOf(",");
		return cityZip.substring(0, i);
	}

	/**
	 * Precondition: The recipient name is the first line of each label on the
	 * mailing list. Postcondition: Prints a list of recipient names to console, one
	 * per line.
	 */
	public void printNames() {
		System.out.println(lines.get(0));
		for (int i = 0; i < lines.size() - 1; i++) {
			if (lines.get(i).compareTo("") == 0) {
				System.out.println(lines.get(i + 1));
			}
		}
	}

	/**
	 * Postcondition: Returns the address of the recipient with the specified name.
	 * 
	 * @param name a name in the lines ArrayList
	 * @return the address of the recipient with the given name
	 */
	public String getAddress(String name) {
		int index = 0;
		int i = 0;
		while (index < lines.size()) {// 获取列表中address开始的位置
			if (lines.get(index).equals(name)) {
				i = index + 1;
				break;
			}
			index++;
		}
		String address = "";
		while (lines.get(i).compareTo("") != 0) {// 将name之后直到“”的元素添加到address之中
			address = address + lines.get(i) + "\n";
			i++;
		}
		return address;
	}
//Other methods are not shown.
}