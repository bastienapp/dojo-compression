class Compression {

	public static String compress(String str) {
	    String result = "";
	    int cpt = 1;
	    
	    for(int i = 0; i < str.length(); i++) {
	        if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
	            if (cpt > 2) {
	                result += String.valueOf(cpt);	                
	            } else if (cpt == 2) {
	                result += str.charAt(i);
	            }
	            result += str.charAt(i);
	        
	            cpt = 1;
	        } else {
	            cpt++;
	        
	        }	            
	    }
	    
	    return result;
	}
}
