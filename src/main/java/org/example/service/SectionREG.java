package org.example.service;

import org.example.model.Section;

import java.util.List;

public interface SectionREG {

    void addSection(Section section);
    void updateSection(Section section);
    void deleteSection(Section section);
    List<Section> displaySections();
}
