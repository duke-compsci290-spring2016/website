The MIT License (MIT)

        Copyright (c) 2015 Robert C. Duvall

        Permission is hereby granted, free of charge, to any person obtaining a copy
        of this software and associated documentation files (the "Software"), to deal
        in the Software without restriction, including without limitation the rights
        to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
        copies of the Software, and to permit persons to whom the Software is
        furnished to do so, subject to the following conditions:

        The above copyright notice and this permission notice shall be included in
        all copies or substantial portions of the Software.

        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
        IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
        FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
        AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
        LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
        OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
        THE SOFTWARE.

java.io.File;;
java.io.FileNotFoundException;;
java.util.ArrayList;;
java.util.Collection;;
java.util.List;;
java.util.Scanner;;

/**
 * Runs a number of algorithms that try to fit files onto disks.
 */
public class Bins {
    // all possible algorithms to compare --- add new instances here!
    private static Algorithm algortihmsToCompare[] = { 
        new WorstFitAlgorithm(),
        new WorstFitDecreasingAlgorithm()
    };


    /**
     * Reads list of integer data from the given input.
     *
     * @param input tied to an input source that contains space separated numbers
     * @return list of the numbers in the order they were read
     */
    public List<Integer> readData (Scanner input) {
        List<Integer> results = new ArrayList<>();
        while (input.hasNext()) {
            results.add(input.nextInt());
        }
        return results;
    }

    /**
     * Returns sum of all values in given list.
     */
    public int getTotal (Collection<Integer> data) {
        int total = 0;
        for (int d : data) {
            total += d;
        }
        return total;
    }

    /**
     * The main program.
     */
    public static void main (String args[]) {
        Bins b = new Bins();
        try {
            List<Integer> data = b.readData(new Scanner(new File(args[0])));
            System.out.println("total size = " + b.getTotal(data) / 1000000.0 + "GB");
            for (Algorithm al : algortihmsToCompare) {
                al.fitDisksAndPrint(data);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Could not open file: " + args[0]);
        }
    }
}
