public class LabVideo extends LabSection{

    public LabVideo(int sectionId, String sectionName) {
        super(sectionId, sectionName);
    }

    @Override
    public String getSectionName(){
        return "video " + super.getSectionName();
    }
}
