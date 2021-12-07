public class Master {
    private int[] array;
    private int count;
    private int sizeofarray;

    public Master() {
        array = new int[1];
        count = 0;
        sizeofarray = 1;
    }

    public void addElement(int a) {
        if (count == sizeofarray) {
            growSize();
        }
        array[count] = a;
        count++;
    }

    public void growSize() {
        int[] temp = null;
        if (count == sizeofarray) {
            temp = new int[sizeofarray + 1];

            for (int i = 0; i < sizeofarray; i++) {
                temp[i] = array[i];
            }

        }
        array = temp;
        sizeofarray = sizeofarray + 1;
    }


    public static void main(String[] args) {
        Master data = new Master();


        data.addElement(12);
        data.addElement(88);
        data.addElement(12);
        data.addElement(88);
        data.addElement(12);
        data.addElement(88);
        data.addElement(12);
        data.addElement(88);
        data.addElement(0);
        System.out.println("Elements of the array:");
        for (int i = 0; i < data.sizeofarray; i++) {
            System.out.print(data.array[i] + " ");
        }

    }
}