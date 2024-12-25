class HourlySalaryEmployee extends Employee {
    private int workedDays;
    private double dailyRate;


    public HourlySalaryEmployee(String firstName, String lastName, String phoneNumber, int workedDays, double dailyRate) {
        super(firstName, lastName, phoneNumber);
        this.workedDays = workedDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateSalary() {
        return workedDays * dailyRate;
    }
}
