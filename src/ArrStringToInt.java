

public class ArrStringToInt {

    int stringToInt(String arr[][]) {
        if (arr.length == 4 && arr[0].length == 4) {

        } else {
            try {
                throw new MySizeArrayException("Не верный массив");
            } catch (MySizeArrayException e) {
                System.out.println(e.getMessage());
            }
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("[0-9]+")) {
                    result += Integer.parseInt(arr[i][j]);
                } else {
                    try {
                        throw new MyArrayDataException("Не верный формат данных в ячейке " + "[" + i + "]" + "[" + j + "]");
                    } catch (MyArrayDataException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }
        }

        return result;
    }

}
