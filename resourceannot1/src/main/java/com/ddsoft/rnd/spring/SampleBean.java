package com.ddsoft.rnd.spring;
 
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
//@Service(value="sampleBean")
public class SampleBean {
 
    @Resource
    private List<String> fruitsList;
 
    public void showFruits() {
        for (String fruit : fruitsList) {
            System.out.println("fruit: " + fruit);
        }
    }
 
    @Resource(name = "prefsList")
    private List<String> prefs;
 
    public void showPrefs() {
        for (String pref : prefs) {
            System.out.println("pref: " + pref);
        }
    }
 
    @Resource
    private Map<String, String> timetable;
 
    public void showTimetable() {
        for (Map.Entry<String, String> subject : timetable.entrySet()) {
            System.out.println(String.format("timetable: %s, %s",
                    subject.getKey(), subject.getValue()));
        }
    }
}