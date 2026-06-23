package Lab13;

public class FilterLongNames {

	public static String[] filterLongNames(String[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 5) {
				count++;
			}
		}

		String[] result = new String[count];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 5) {
				result[index] = arr[i];
				index++;
			}
		}

		return result;
	}
}