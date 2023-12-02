package JavaAdvanceCoding.Exercise18_19;
import java.util.Objects;
public class Computer {
    private String processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;


    public Computer(String processor, int ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{ " +
                "processor= '" + processor + '\'' +
                ", ram= " + ram +
                ", graphics Card= '" + graphicsCard + '\'' +
                ", company= '" + company + '\'' +
                ", model= '" + model + '\'' +
                "}";
    }
    @Override
    public int hashCode () {
        return Objects.hash(processor,ram,graphicsCard,company,model);
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Computer that = (Computer) o;
        return Objects.equals(processor,that.processor) &&
                ram == that.ram &&
                Objects.equals(graphicsCard,that.graphicsCard) &&
                Objects.equals(company,that.company) &&
                Objects.equals(model,that.model);
    }
}
