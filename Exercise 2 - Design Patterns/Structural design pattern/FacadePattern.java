// Subsystems like VideoEncoder, AudioEncoder, and FileWriter handle specific parts of the process.
// VideoConverterFacade simplifies the process for the client 
// by providing a single method convert() that internally calls the subsystems.

// Subsystems
class VideoEncoder {
    void encode(String format) {
        System.out.println("Encoding video to " + format + " format.");
    }
}

class AudioEncoder {
    void encode(String format) {
        System.out.println("Encoding audio to " + format + " format.");
    }
}

class FileWriter {
    void write(String fileName) {
        System.out.println("Writing output to file: " + fileName);
    }
}

// Facade
class VideoConverterFacade {
    private VideoEncoder videoEncoder = new VideoEncoder();
    private AudioEncoder audioEncoder = new AudioEncoder();
    private FileWriter fileWriter = new FileWriter();

    public void convert(String videoFormat, String audioFormat, String outputFileName) {
        videoEncoder.encode(videoFormat);
        audioEncoder.encode(audioFormat);
        fileWriter.write(outputFileName);
    }
}

// Client
public class FacadePattern {
    public static void main(String[] args) {
        VideoConverterFacade converter = new VideoConverterFacade();
        converter.convert("MP4", "AAC", "output.mp4");
    }
}
