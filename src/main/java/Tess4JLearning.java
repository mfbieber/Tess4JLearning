import java.io.File;
import net.sourceforge.tess4j.*;

public class Tess4JLearning {

    public static void main(String[] args) {
        File pdfFile = new File("tessdata/pomodoroTimer.pdf");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(pdfFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}