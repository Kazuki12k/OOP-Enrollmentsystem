package org.example.service;

import org.example.model.Section;

import java.util.ArrayList;
import java.util.List;

public class SectionRegistration implements SectionREG {

    private ArrayList<Section> sectionList = new ArrayList<>();

    public void addSection(Section section) {
        sectionList.add(section);
    }

    public List<Section> displaySections() {
        return sectionList;
    }

    public void updateSection(Section section) {

        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionName().equalsIgnoreCase(section.getSectionName())) {

                sectionList.set(i, section);
                break;
            }
        }
    }

    public void deleteSection(Section section) {

        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getSectionName().equalsIgnoreCase(section.getSectionName())) {

                sectionList.remove(i);
                break;
            }
        }
    }
}