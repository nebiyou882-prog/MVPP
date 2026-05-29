class SalesManager extends Job {
    protected int experienceYears;

    public SalesManager(String name, String location, String age, int time, double basePrice, int experienceYears) {
        super(name, location, age, time, basePrice);
        this.experienceYears = experienceYears;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Company Requirement: Minimum " + experienceYears + " years experience.");
    }
}

class VideoEditor extends SalesManager {
    private String software;

    public VideoEditor(String name, String location, String age, int time, double basePrice, String software) {
        super(name, location, age, time, basePrice, 0);
        this.software = software;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Required Software: " + software);
    }
}
