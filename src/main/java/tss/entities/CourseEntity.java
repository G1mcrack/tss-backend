package tss.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Mingqi Yi
 */
@Entity
@Table(name = "course")
public class CourseEntity {
    private String cid;
    private String name;
    private Float credit;
    private Character semester;
    private String intro;
    private Set<SectionEntity> sections = new HashSet<>();

    @Id
    @Column(name = "course_id", length = 10)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Column(name = "course_name", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "course_credit", nullable = false)
    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    @Column(name = "course_semester", nullable = false)
    public Character getSemester() {
        return semester;
    }

    public void setSemester(Character semester) {
        this.semester = semester;
    }

    @Column(name = "course_intro", length = 200)
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    public Set<SectionEntity> getSections() {
        return sections;
    }

    public void setSections(Set<SectionEntity> sections) {
        this.sections = sections;
    }

    /*public Integer getExamBeginTime() {
        return examBeginTime;
    }

    public void setExamBeginTime(Integer examBeginTime) {
        this.examBeginTime = examBeginTime;
    }

    public Integer getExamduration() {
        return examDuration;
    }

    public void setExamduration(Integer examDuration) {
        this.examDuration = examDuration;
    }*/
}

