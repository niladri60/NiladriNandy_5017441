package computerBuilds;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .build();

        System.out.println(basicComputer);


        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 10")
                .build();

        System.out.println(gamingComputer);


        Computer workstation = new Computer.Builder()
                .setCPU("Intel Xeon")
                .setRAM("64GB")
                .setStorage("4TB SSD")
                .setGraphicsCard("NVIDIA Quadro RTX 6000")
                .setMotherboard("High-End Workstation Motherboard")
                .setOperatingSystem("Windows 10 Pro")
                .build();

        System.out.println(workstation);
    }
}
