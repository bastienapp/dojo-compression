class Compression {

	public static String compress(String text) {
		char[] letters = text.toCharArray();
		if (letters.length <= 1) {
			return text;
		}
		char nextChar = '\0';
		int count = 0;
		String result = "";
		for (int i = 0; i < letters.length; i++) {
			count++;
			if (i + 1 < letters.length) {
				nextChar = letters[i + 1];
			} else {
				nextChar = '\0';
			}
			if (letters[i] != nextChar) {
				if (count > 2) {
					result += String.valueOf(count) + letters[i];
				} else {
					for (int j = 0; j < count; j++) {
						result += letters[i];
					}
				}
				count = 0;
			}
		}
		return result;
	}
}