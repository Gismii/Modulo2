package Overload;

public class Overload {
    public class Computer {
        private String memoryRam;
        private String processor;
        private String screen;
        private String videoCard;
        private String storageCapacity;
        public Computer() {
        }
        public Computer(String memoryRam) {
            this.memoryRam = memoryRam;
        }
        public Computer(String memoryRam, String processor) {
            this.memoryRam = memoryRam;
            this.processor = processor;
        }
        public Computer(String memoryRam, String processor, String screen) {
            this.memoryRam = memoryRam;
            this.processor = processor;
            this.screen = screen;
        }
        public Computer(String memoryRam, String processor, String screen, String videoCard) {
            this.memoryRam = memoryRam;
            this.processor = processor;
            this.screen = screen;
            this.videoCard = videoCard;
        }
        public Computer(String memoryRam, String processor, String screen, String videoCard,
                        String storageCapacity) {
            this.memoryRam = memoryRam;
            this.processor = processor;
            this.screen = screen;
            this.videoCard = videoCard;
            this.storageCapacity = storageCapacity;
        }
    }
}
