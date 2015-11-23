public class Solution {
    public static int romanToInt(String s) {
		int result = 0;
		char[] putRomanNumberIntoCharArray = s.toCharArray();
		ArrayList<Integer> integerArrayCorrespondToCharArray = new ArrayList<Integer>();

		for (int i = 0; i < putRomanNumberIntoCharArray.length; i++) {
			switch (putRomanNumberIntoCharArray[i]) {
			case 'I': {
				integerArrayCorrespondToCharArray.add(1);
				break;
			}

			case 'V': {
				integerArrayCorrespondToCharArray.add(5);
				break;
			}

			case 'X': {
				integerArrayCorrespondToCharArray.add(10);
				break;
			}

			case 'L': {
				integerArrayCorrespondToCharArray.add(50);
				break;
			}

			case 'C': {
				integerArrayCorrespondToCharArray.add(100);
				break;
			}

			case 'D': {
				integerArrayCorrespondToCharArray.add(500);
				break;
			}

			case 'M': {
				integerArrayCorrespondToCharArray.add(1000);
				break;
			}

			default: {
				integerArrayCorrespondToCharArray.add(0);
				break;
			}

			}// end switch loop
		}// end for loop

		for (int i = 0; i < integerArrayCorrespondToCharArray.size(); i++) {
			if (i == integerArrayCorrespondToCharArray.size() - 1) {
				result = result + integerArrayCorrespondToCharArray.get(i);
			} else {
				if (integerArrayCorrespondToCharArray.get(i + 1) > integerArrayCorrespondToCharArray
						.get(i)) {
					result = result
							+ (integerArrayCorrespondToCharArray.get(i + 1) - integerArrayCorrespondToCharArray
									.get(i));
					i++;
				} else if(integerArrayCorrespondToCharArray.get(i + 1) <= integerArrayCorrespondToCharArray
						.get(i)){
					result = result + integerArrayCorrespondToCharArray.get(i);
				}
			}//end big else loop

		}// end for loop

		return result;
	}
}