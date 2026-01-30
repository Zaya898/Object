package BasicCodes;

import javax.swing.*;
import java.awt.*;

public class StudentInfoForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Оюутны мэдээлэл оруулах");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        JPanel personalPanel = new JPanel(new GridLayout(5, 2));
        personalPanel.setBorder(BorderFactory.createTitledBorder("Оюутны хувийн мэдээлэл"));
        personalPanel.add(new JLabel("Оюутны нэр:"));
        JTextField nameField = new JTextField();
        personalPanel.add(nameField);

        personalPanel.add(new JLabel("Оюутны хүйс:"));
        JPanel genderPanel = new JPanel();
        JRadioButton male = new JRadioButton("эрэгтэй");
        JRadioButton female = new JRadioButton("эмэгтэй");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        personalPanel.add(genderPanel);

        personalPanel.add(new JLabel("Оюутны нас:"));
        JTextField ageField = new JTextField();
        personalPanel.add(ageField);

        personalPanel.add(new JLabel("Утасны дугаар:"));
        JTextField phoneField = new JTextField();
        personalPanel.add(phoneField);

        JButton addButton = new JButton("НЭМЭХ");
        personalPanel.add(addButton);

        JPanel eduPanel = new JPanel(new GridLayout(4, 2));
        eduPanel.setBorder(BorderFactory.createTitledBorder("Оюутны сургалтын мэдээлэл"));
        eduPanel.add(new JLabel("Элссэн хөтөлбөр:"));
        JComboBox<String> programBox = new JComboBox<>(new String[]{"Программ хангамж", "Мэдээллийн систем", "Сүлжээ"});
        eduPanel.add(programBox);

        eduPanel.add(new JLabel("Элссэн он:"));
        JTextField yearField = new JTextField();
        eduPanel.add(yearField);

        eduPanel.add(new JLabel("Элссэн код:"));
        JTextField codeField = new JTextField();
        eduPanel.add(codeField);

        JButton backButton = new JButton("БУЦАХ");
        eduPanel.add(backButton);

        frame.add(personalPanel);
        frame.add(eduPanel);
        frame.setVisible(true);
    }
}
