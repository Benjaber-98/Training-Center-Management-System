/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itse322.project.Frames.students;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import itse322.project.Controllers.StudentController;
import itse322.project.LoggedUser;
import itse322.project.Message;
import itse322.project.Models.Student;
import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;
/**
 *
 * @author Mahmoud
 */
public class Students extends javax.swing.JFrame {
    
    Logger log = Logger.getLogger(Students.class);
    StudentController studentController = new StudentController();

    /**
     * Creates new form Students
     */
    public Students() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        refreshTable();
        idLabel.setVisible(false);
        ArrayList<String> ages = new ArrayList<>();
        for(Integer i = 10; i <= 40; i++) {
            ages.add(i.toString());
        }
        //Set Ages from 10 to 40 in comboBox
        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(ages.toArray(new String[0])));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        exportBtn = new javax.swing.JButton();
        detailsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageComboBox = new javax.swing.JComboBox<>();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maleGender = new javax.swing.JRadioButton();
        femaleGender = new javax.swing.JRadioButton();
        saveStudentBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backBtn = new javax.swing.JButton();

        setTitle("Manage Students");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 118, 210));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manage Students");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addContainerGap(985, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1422, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        deleteBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahmoud\\Documents\\NetBeansProjects\\ITSE322 Project\\Icons\\delete.png")); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        exportBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahmoud\\Documents\\NetBeansProjects\\ITSE322 Project\\Icons\\export.png")); // NOI18N
        exportBtn.setText("Export As PDF");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        detailsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahmoud\\Documents\\NetBeansProjects\\ITSE322 Project\\Icons\\details.png")); // NOI18N
        detailsBtn.setText("More Details");
        detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBtnActionPerformed(evt);
            }
        });

        studentsTable.setBackground(new java.awt.Color(255, 255, 255));
        studentsTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        studentsTable.setForeground(new java.awt.Color(255, 255, 255));
        studentsTable.setModel(getTableContent());
        studentsTable.setGridColor(new java.awt.Color(255, 255, 255));
        studentsTable.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jScrollPane1.setViewportView(studentsTable);
        if (studentsTable.getColumnModel().getColumnCount() > 0) {
            studentsTable.getColumnModel().getColumn(0).setResizable(false);
            studentsTable.getColumnModel().getColumn(1).setResizable(false);
            studentsTable.getColumnModel().getColumn(2).setResizable(false);
            studentsTable.getColumnModel().getColumn(3).setResizable(false);
            studentsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 118, 210), 2, true), "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(55, 71, 79));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("First Name :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Last Name :");

        firstNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        firstNameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        firstNameTextField.setBorder(null);

        lastNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        lastNameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lastNameTextField.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Age :");

        ageComboBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        phoneNumberTextField.setBackground(new java.awt.Color(255, 255, 255));
        phoneNumberTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        phoneNumberTextField.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number : ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Gender :");

        maleGender.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(maleGender);
        maleGender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        maleGender.setSelected(true);
        maleGender.setText("Male");

        femaleGender.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(femaleGender);
        femaleGender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        femaleGender.setText("Female");

        saveStudentBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahmoud\\Documents\\NetBeansProjects\\ITSE322 Project\\Icons\\save.png")); // NOI18N
        saveStudentBtn.setText("Add");
        saveStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStudentBtnActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idLabel.setText("Random Id");

        clearBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahmoud\\Documents\\NetBeansProjects\\ITSE322 Project\\Icons\\clear.png")); // NOI18N
        clearBtn.setText("Clear Fields");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(25, 118, 210));

        jSeparator2.setForeground(new java.awt.Color(25, 118, 210));

        jSeparator3.setForeground(new java.awt.Color(25, 118, 210));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(clearBtn)
                                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleGender)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleGender))
                                    .addComponent(jSeparator3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(ageComboBox, 0, 193, Short.MAX_VALUE)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idLabel)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(maleGender)
                    .addComponent(femaleGender))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveStudentBtn))
                .addGap(77, 77, 77))
        );

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahmoud\\Documents\\NetBeansProjects\\ITSE322 Project\\Icons\\back.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(detailsBtn)
                        .addGap(24, 24, 24)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn)
                    .addComponent(exportBtn)
                    .addComponent(backBtn))
                .addGap(765, 765, 765))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean fieldsAreEmpty() {
        if (firstNameTextField.getText().equals("") 
                || lastNameTextField.getText().equals("")
                || phoneNumberTextField.getText().equals("")) {
            Message.showWarningMessage("All Fields Are Required");
            return true;
        }
        return false;
    }

    private void resetFields() {
        int row = studentsTable.getSelectedRow();
        idLabel.setText("Random Id");
        firstNameTextField.setText("");
        lastNameTextField.setText("" );
        ageComboBox.setSelectedItem("10");
        maleGender.setSelected(true);
        phoneNumberTextField.setText( "" );
        saveStudentBtn.setText("Add");
        if(row != -1)
            studentsTable.removeRowSelectionInterval(row, row);
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = studentsTable.getSelectedRow();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        if(selectedRow != -1) {
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this student ?","Warning", dialogButton);
            if(dialogResult == JOptionPane.NO_OPTION){
              return;
            }
        }
        
        if(selectedRow != -1) {
            int sid = Integer.parseInt(studentsTable.getValueAt(selectedRow, 0).toString() );
            String firstName = studentsTable.getValueAt(selectedRow, 1).toString();
            String lastName = studentsTable.getValueAt(selectedRow, 2).toString();
            log.info(LoggedUser.getUsername() + " Deleted the student " + sid + " - " + firstName + " " + lastName);
            studentController.deleteStudent(sid);
            int row = studentsTable.convertRowIndexToModel(selectedRow);
            DefaultTableModel model = (DefaultTableModel)studentsTable.getModel();
//            studentsTable.setRowSelectionInterval( nextRow, nextRow );
            model.removeRow(row);
            resetFields();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBtnActionPerformed
        
        int row = studentsTable.convertRowIndexToModel(studentsTable.getSelectedRow());
        if(row == -1) return;
        int id = (Integer)studentsTable.getModel().getValueAt(row, 0);
        Student student = studentController.getStudentById(id);
        new StudentDetails(student).setVisible(true);
        
        
    }//GEN-LAST:event_detailsBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        resetFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void saveStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStudentBtnActionPerformed
        if( fieldsAreEmpty() ) return;

        Student student = new Student();
        student.setFirstName(firstNameTextField.getText());
        student.setLastName(lastNameTextField.getText());
        student.setAge(Integer.parseInt( ageComboBox.getSelectedItem().toString() ) );
        String gender;
        if(maleGender.isSelected()) {
            gender = "Male";
        } else {
            gender = "female";
        }
        student.setGender(gender);
        student.setPhoneNumber(phoneNumberTextField.getText());

        if(idLabel.getText().equals("Random Id")) {
            studentController.addStudent(student);
            resetFields();
            refreshTable();
            log.info(LoggedUser.getUsername() + " Added a student " + student.getFirstName() + " " + student.getLastName());
        } else {
            student.setId( Integer.parseInt( idLabel.getText() ) );
            studentController.updateStudent(student);
            updateStudentRow(student);
            log.info(LoggedUser.getUsername() + " Updated the student " + student.getId());
        }

    }//GEN-LAST:event_saveStudentBtnActionPerformed

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        try {
            String file = JOptionPane.showInputDialog("Enter file name");
            if(file == "" || file == null) return;
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("Student reports\\"+file+".pdf"));
            doc.open();
            doc.add(new Paragraph("Students' table report",
                    FontFactory.getFont(FontFactory.TIMES_BOLD, 24, BaseColor.BLUE) )
            );
            doc.add(new Paragraph("  "));
            PdfPTable pdfTable = new PdfPTable(studentsTable.getColumnCount());
            pdfTable.setWidthPercentage(100);
            //adding table headers
            for (int i = 0; i < studentsTable.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Paragraph(studentsTable.getColumnName(i)));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell.setPaddingTop(5);
                cell.setPaddingBottom(5);
                pdfTable.addCell(cell);
            }
            //extracting data from the JTable and inserting it to PdfPTable
            for (int rows = 0; rows < studentsTable.getRowCount(); rows++) {
                for (int cols = 0; cols < studentsTable.getColumnCount(); cols++) {
                    PdfPCell cell = new PdfPCell(
                            new Paragraph(studentsTable.getModel().getValueAt(rows, cols).toString())
                    );
                    cell.setPaddingTop(3);
                    cell.setPaddingBottom(3);
                    pdfTable.addCell(cell);
                }
            }
            doc.add(pdfTable);
            
            doc.add(new Paragraph("Number Of Students : " + studentsTable.getRowCount()));
                        
            doc.add(new Paragraph("Created At : "+getCurrentTime(), 
                    FontFactory.getFont(FontFactory.TIMES_BOLD, 12, BaseColor.BLACK) 
            ));
            
            doc.close();
            Message.showDoneMessage("Report Created Successfully");
        } catch (DocumentException | FileNotFoundException ex) {
            Message.showWarningMessage(ex.toString());
            log.error("\n--------Error Message------\n",ex);
        }
    }//GEN-LAST:event_exportBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private String getCurrentTime() {
        //Current Milliseconds
        long currentMilliSeconds = System.currentTimeMillis();

        //The Format Of Timestamp
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 

        //Creating a new Date from milliseconds
        Date currentDate = new Date(currentMilliSeconds);

        //Getting the timestamp in variable
        String time = dateFormat.format( currentDate );
        return time;
    }
    
    private void getStudentDetails() {
        studentsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = studentsTable.getSelectedRow();
                if(row == -1) 
                    return;
                
                idLabel.setText( studentsTable.getValueAt(row, 0).toString() );
                firstNameTextField.setText( studentsTable.getValueAt(row, 1).toString() );
                lastNameTextField.setText( studentsTable.getValueAt(row, 2).toString() );
                ageComboBox.setSelectedItem( studentsTable.getValueAt(row, 3).toString() );
                String gender = studentsTable.getValueAt(row, 4).toString();
                if(gender.equals("Male")) {
                    maleGender.setSelected(true);
                } else {
                    femaleGender.setSelected(true);
                }
                phoneNumberTextField.setText( studentsTable.getValueAt(row, 5).toString() );
                saveStudentBtn.setText("Update");
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }
    
    private void refreshTable() {
        studentsTable = new javax.swing.JTable();
        studentsTable.setModel(getTableContent());
        studentsTable.setGridColor(Color.white);
        studentsTable.setRowHeight(30);
        studentsTable.setBackground(new java.awt.Color(255, 255, 255));
        //studentsTable.setSelectionBackground(new java.awt.Color(43,255,182));
        //studentsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        studentsTable.setFont(new java.awt.Font("Dialog", 1, 14));
        studentsTable.setShowGrid(false);
        studentsTable.setMaximumSize(new java.awt.Dimension(1000, 1000));
        JTableHeader header = studentsTable.getTableHeader();
        header.setBackground(new java.awt.Color(25,118,210));
        header.setForeground(Color.white);
        header.setAlignmentX(LEFT_ALIGNMENT);
        header.setPreferredSize(new Dimension(jScrollPane1.getWidth(), 30));
        jScrollPane1.setViewportView(studentsTable);
        if (studentsTable.getColumnModel().getColumnCount() > 0) {
            studentsTable.getColumnModel().getColumn(0).setResizable(false);
            studentsTable.getColumnModel().getColumn(1).setResizable(false);
            studentsTable.getColumnModel().getColumn(2).setResizable(false);
            studentsTable.getColumnModel().getColumn(3).setResizable(false);
            studentsTable.getColumnModel().getColumn(4).setResizable(false);
        }
        //sorting by id
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(studentsTable.getModel());
        studentsTable.setRowSorter(sorter);
        
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int columnIndexToSort = 0;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        //when click on selectedRow in table
        getStudentDetails();
    }
    
    //return model contains all content to put in a table
    private DefaultTableModel getTableContent() {
        String[] columnNames = {"ID", "First Name","Last Name","Age", "Gender", "Phone Number"};

        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };

        dtm.setColumnCount(6);
        
        
        HashSet<Student> students = studentController.getAllStudents();
        
        for(Student s : students) {
            dtm.addRow(new Object[] {
                s.getId(),
                s.getFirstName(),
                s.getLastName(),
                s.getAge(),
                s.getGender(),
                s.getPhoneNumber()
            });
        }
        
        return dtm;
    }
    
    
    
    private void updateStudentRow(Student student) {
        int row = studentsTable.convertRowIndexToModel(studentsTable.getSelectedRow());
        ((DefaultTableModel)studentsTable.getModel()).setValueAt( student.getFirstName() , row, 1);
        ((DefaultTableModel)studentsTable.getModel()).setValueAt( student.getLastName(), row, 2);
        ((DefaultTableModel)studentsTable.getModel()).setValueAt( student.getAge(), row, 3);
        
        ((DefaultTableModel)studentsTable.getModel()).setValueAt( student.getGender() , row, 4);
        ((DefaultTableModel)studentsTable.getModel()).setValueAt( student.getPhoneNumber(), row, 5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageComboBox;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton detailsBtn;
    private javax.swing.JButton exportBtn;
    private javax.swing.JRadioButton femaleGender;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleGender;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveStudentBtn;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables
}
