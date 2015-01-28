package com.appspot.myswaram.logic;

public class PatternToHtmlMapper {
	
	public static String convert(String pattern) {//Test commit
		String[] swaramArray = pattern.split(",");
		String[][] tableArray = new String[32][32];
		int x = tableArray.length / 2 - 1;
		int y = 0;
		tableArray[x][y] = swaramArray[0];
		String previous = swaramArray[0];
		for (int i = 1; i < swaramArray.length; i++) {
			if (getNotePosition(swaramArray[i]) != Constants.BLANKNOTE && getNotePosition(previous) != Constants.BLANKNOTE) {
				if (getNotePosition(previous) < getNotePosition(swaramArray[i])) {
					x--;
				} else if (getNotePosition(previous) > getNotePosition(swaramArray[i])) {
					x++;
				}
			}
			y++;
			if (x < 0 || x >= tableArray.length || y < 0 || y >= tableArray[0].length) {
				return Constants.RESULT.replace("%table_data%", "<tr><td>Pattern too long</td></tr>");
			}
			tableArray[x][y] = swaramArray[i];
			previous = swaramArray[i];
		}
		String tableData = "";
		for (String[]  rowData : tableArray) {
			tableData += "<tr>";
			for (String colData : rowData) {
				tableData += "<td>"+ (colData!=null ? ((!colData.equals("") && !colData.equals(" ")) ? colData : ",") : "") + "</td>";
			}
			tableData += "</tr>";
		}
		return Constants.RESULT.replace("%table_data%", tableData);
	}

	private static Integer getNotePosition(String swaram) {
		System.out.println(swaram);
		System.out.println(swaram.toUpperCase());
		System.out.println(Constants.AAROHANAM.get(swaram.toUpperCase()));
		return (swaram!=null && !swaram.equals("") && !swaram.equals(" ")) ? Constants.AAROHANAM.get(swaram.toUpperCase()) : Constants.BLANKNOTE;
	}
	
}
