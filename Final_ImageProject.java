package final_imageproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

//this program can read .CR2 in RAW file  
public class Final_ImageProject {

    public static String hexToString(byte[] output) {
        char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder buf = new StringBuilder();
        for (int j = 0; j < output.length; j++) {
            buf.append(hexDigit[(output[j] >> 4) & 0x0f]);
            buf.append(hexDigit[output[j] & 0x0f]);
        }
        return buf.toString();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the file name with extension and make sure that file on same folder of project");
        System.out.print("File Name: ");
        String in = sc.next();

        //return the path to user
        Path RelativePath = Paths.get(in);
        Path AbsolutePath = RelativePath.toAbsolutePath();
        System.out.println("File path: " + AbsolutePath);

        byte[] array = new byte[45];
        InputStream input = new FileInputStream(in);
        input.read(array);
        String check = hexToString(Arrays.copyOfRange(array, 0, 4));

        //check the type of image
        if (hexToString(Arrays.copyOfRange(array, 0, 10)).equalsIgnoreCase("49492A00100000004352")) {
            System.out.println("The Type of this Image is RAW ");
        } else if (hexToString(Arrays.copyOfRange(array, 0, 2)).equalsIgnoreCase("424D")) {
            System.out.println("The Type of this Image is BMP ");
        } else if (check.equalsIgnoreCase("FFD8FFE0")) {
            System.out.println("The Type of this Image is JPEG ");
        } else if (check.equalsIgnoreCase("49492A00") || check.equalsIgnoreCase("4D4D002A")) {
            System.out.println("The Type of this Image is TIFF ");
        } else if (check.equalsIgnoreCase("89504E47")) {
            System.out.println("The Type of this Image is PNG ");
        } else if (check.equalsIgnoreCase("47494638")) {
            System.out.println("The Type of this Image is GIF ");
        } else {
            System.out.println("The program doesn't support this type of image ");
        }

    }

}
