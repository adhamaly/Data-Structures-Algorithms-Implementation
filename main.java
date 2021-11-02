import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        /*
         * Scanner input = new Scanner(System.in);
         * 
         * // adding 5 StudentNames into LinkedList LinkedListADT<String> StudentsList =
         * new LinkedListADT<>(); int i = 0; while(i<5){
         * StudentsList.insertAtTop(input.nextLine()); i++; }
         * StudentsList.printLinkedList(); //------------------------------------------
         * 
         * // adding 5 people in Queue which are waiting ..
         * 
         * QueueADT<String> queuedPeople = new QueueADT<>(5); int x = 0; while(x<5){
         * queuedPeople.Enqueue(input.nextLine()); x++; } queuedPeople.printQueue(); //
         * dequeue first 2 people queuedPeople.dequeue(); queuedPeople.dequeue();
         * queuedPeople.printQueue();
         * 
         * //--------------------------------------- // adding 6 books in box and then
         * pop first 3 books StackADT<String> Box = new StackADT<>(6); int y = 0;
         * while(y<6){ Box.push(input.nextLine()); y++; } Box.printStack(); Box.pop();
         * Box.pop(); Box.pop(); Box.printStack();
         * 
         * //-------------------- int[] ages = {21,12,13,14,16,22,32,33};
         * SelectionSort.Sort(ages); System.out.print("selection Sort ... ");
         * SelectionSort.printSortedArray(ages); System.err.print("\n");
         * //------------------------------ InsertionSort.Sort(ages);
         * System.out.print("Insertion  Sort ... "); InsertionSort.printSorted(ages);
         * System.err.print("\n"); //--------------------------------
         * BubbleSort.Sort(ages); System.out.print("Bubble Sort ... ");
         * BubbleSort.printSorted(ages); System.err.print("\n");
         * 
         */
        /*
         * // Search an array using Linear Search int[] employeeId =
         * {101,102,103,104,105,106,107}; int id = new LinearSearch().Search(employeeId,
         * 104); System.out.println("employee Id = "+id);
         * 
         * int id2 = new BinarySearch().Search(employeeId, 104);
         * System.out.println("employee Id = "+id2);
         * 
         * int[] a = {19,8,-13,2,-5,4,100,30}; MergeSort.Sort(a,0, a.length-1);
         * MergeSort.printSorted(a);
         * 
         * System.out.println(Period.between(LocalDate.of(1999, 3, 1),
         * LocalDate.now()).getYears());
         * 
         * StackADT<Character> s = new StackADT<>(10); s.push('a'); s.push('b');
         * s.push('c'); System.out.println(s.isEmpty());
         * System.out.println(s.contain('b')); System.out.println(s.getSize());
         * 
         * QueueADT<Character> q = new QueueADT<>(10); q.Enqueue('a'); q.Enqueue('b');
         * q.Enqueue('c'); System.out.println(q.isEmpty());
         * System.out.println(q.contain('b')); System.out.println(q.getSize());
         * 
         * LinkedListADT<Character> l = new LinkedListADT<>(); l.insertAtTop('a');
         * l.insertAtTop('b'); l.insertAtTop('c');
         * 
         * System.out.println("index of b "+l.contain('c'));
         * System.out.println(l.getSize());
         * 
         * 
         * int[] e = {1,7,3,6,5,6}; int x = pivotIndex(e); System.out.println(x);
         * 
         * System.out.println("\n");
         * 
         * 
         * int[] f = {1,2,3,4}; int h = dominantIndex(f);
         * System.out.println("bigeer == "+h);
         * 
         * System.out.println("\n");
         * 
         * 
         * int[] pl = {8,9,9,9}; int[] pa = plusOne(pl); for (var i = 0; i < pa.length;
         * i++) { var each = pa[i]; System.out.println(each);
         * 
         * }
         * 
         * 
         * int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
         * 
         * int[] ara = findDiagonalOrder(arr); for (var i = 0; i < ara.length; i++) {
         * System.out.println(ara[i]); }
         * 
         * 
         * System.out.println("row = " +arr.length+" col = "+arr[0].length);
         * 
         */

        QueueADT<Integer> q = new QueueADT<>(Integer.class,10);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(12);
        q.Enqueue(4);
        q.Enqueue(9);
        q.printQueue();
        int x =q.getMax();
        System.out.println(x);

        LinkedListADT<Integer> l  = new LinkedListADT<>();
        l.insertAtTop(1);
        l.insertAtTop(4);
        l.insertAtTop(2);
        l.insertAtTop(100);
        System.out.println(Integer.valueOf(l.getMax()));    
        
        StackADT<Double> s =new StackADT<>(Double.class, 10);
        s.push(1.9);
        s.push(3.9);
        s.push(5.9);
        s.push(7.9);
        System.out.println(s.getMax());

    }

    public static int pivotIndex(int[] nums) {

        int len = nums.length;
        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                lSum = 0;

            }
            int l = i - 1;
            int r = i + 1;

            while (l > -1) {
                lSum += nums[l];
                l--;
            }
            while (r < len) {
                rSum += nums[r];
                r++;
            }

            if (rSum == lSum) {
                return i;
            } else {
                lSum = 0;
                rSum = 0;
            }

        }

        return -1;

    }

    public static int dominantIndex(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int secMaxNum = Integer.MIN_VALUE;
        System.out.println(secMaxNum + "- " + maxNum);
        int maxIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= maxNum) {
                secMaxNum = maxNum;
                maxNum = nums[i];
                maxIdx = i;
            } else if (nums[i] > secMaxNum) {
                secMaxNum = nums[i];
            }
        }

        return maxNum >= 2 * secMaxNum ? maxIdx : -1;
    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;

    }

    public static int[] findDiagonalOrder(int[][] mat) {

        int len = mat.length;

        int newLen = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newLen++;
            }
        }

        int[] array = new int[newLen];
        int counter = 0;
        while (counter < newLen) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    array[counter++] = mat[i][j];
                }
            }
        }

        return array;

    }
}
