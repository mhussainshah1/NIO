package review;

import java.nio.file.Path;

public class One {
    public static void main(String[] args) {
         var path = Path.of("/user/./root","../kodiacbear.txt");
//         path.normalize().relativize("/lion"); //DOESN'T COMPILE - relativize(path)
        //Path is immutable
         System.out.println(path);
    }
}
