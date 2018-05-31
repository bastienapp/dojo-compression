class Compression {

	public static String compress(String s){
		int count = 0;
		char current = ' ';
		String result = "";

		for(int i = 0; i < s.length(); i++){

			current = s.charAt(i);
			count = 1;

			for(int j = i+1; j < s.length(); j++) {
				if (current == s.charAt(j)) {
					count++;
					i++;
				}												
			}
			
			if (count <= 2) {
				for (int k = 0; k < count ; k++) {
					result += current;
				}	
			} else {
				result += String.valueOf(count) + current;
			}	
		}

		return result;
	}
}
