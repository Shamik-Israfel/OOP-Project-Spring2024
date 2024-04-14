/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145;

import Shamik_Mondal_2221145.Account_Manager.incomeManagement;
import Shamik_Mondal_2221145.HR_Manager.PaySalariesModelClass;
import Shamik_Mondal_2221145.HR_Manager.timeAttendanceModel;
import Shamik_Mondal_2221145.HR_Manager.timePerformanceModel;
import Shamik_Mondal_2221145.HR_Manager.HRLeaveModel ;
import Shamik_Mondal_2221145.HR_Manager.jobRecruitModel;
import Shamik_Mondal_2221145.HR_Manager.trainingModelClass;
import Shamik_Mondal_2221145.Account_Manager.employeeSalaryDetails;
import Shamik_Mondal_2221145.Account_Manager.expensesTrackingSystemModelclass;









import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author hp
 */
public class ReadWrite {

    public static <T> Boolean writeObjectToFile(String fileName, T instance) {
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        File f = null;
        try {
            f = new File(fileName);
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            try {
                oos.writeObject(instance);
                oos.close();
                return true;
            } catch (IOException ex) {
                GenerateAlerts.unsuccessfulAlert("Error while writing the File." + "\n"
                        + "Please Check your Storage Efficiency, File type and name.");
            }
        } catch (Exception e) {
            GenerateAlerts.unsuccessfulAlert("Data is Vulnerable." + "\n" + "Please try again rechecking your data"
                    + "If you can't solve the issue. Contact Software maintainer.");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                GenerateAlerts.unsuccessfulAlert("Error while closing the Binary File.");
                return false;
            }
        }
        return false;

    }

    public static <T> ObservableList<?> readObjectToFile(String fileName, T instance) {
        System.out.println("Shamik1");
        File f = null;
        FileInputStream fw = null;
        ObjectInputStream ois = null;

        ObservableList<SignupData> SData = FXCollections.observableArrayList();
        ObservableList<timeAttendanceModel> AttendanceData = FXCollections.observableArrayList();
        ObservableList<timePerformanceModel> PerformanceData = FXCollections.observableArrayList();
        ObservableList<Employee> employeeinfoData = FXCollections.observableArrayList();
        ObservableList<PaySalariesModelClass> PaySalariesinfoData = FXCollections.observableArrayList();
        ObservableList<incomeManagement> IncomeinfoData= FXCollections.observableArrayList();
        ObservableList<HRLeaveModel> leaveData = FXCollections.observableArrayList();
        ObservableList<jobRecruitModel> recruitData = FXCollections.observableArrayList();
        ObservableList<trainingModelClass> tmcData = FXCollections.observableArrayList();
        ObservableList<employeeSalaryDetails> SalaryCalculator = FXCollections.observableArrayList();
         ObservableList<expensesTrackingSystemModelclass> expenseTracking = FXCollections.observableArrayList();

          
          
          
          
          
          
          
          
        try {
            if (instance instanceof SignupData) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        SData.add((SignupData) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Signup execution");
                }
                //  System.out.println("Hasib");               
            } else if (instance instanceof timeAttendanceModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        AttendanceData.add((timeAttendanceModel) ois.readObject());
                    }
                } catch (Exception e) {
                    System.out.println("Shamik attendance exe");
                }
                //  System.out.println("Meraj");               
            } 
            else if (instance instanceof timePerformanceModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                        PerformanceData.add((timePerformanceModel) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik Performance exe");

                }
            }
            
            else if (instance instanceof Employee) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                       employeeinfoData.add((Employee) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik employeeinfo exe");

                }
            }
            
            
            
            
            else if (instance instanceof PaySalariesModelClass) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                       PaySalariesinfoData.add((PaySalariesModelClass) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik PaySalariesinfo exe");

                }
            }
            
            
            
            else if (instance instanceof incomeManagement) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                       IncomeinfoData.add((incomeManagement) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik Incomeinfo exe");

                }
            }
            
            
            
             else if (instance instanceof HRLeaveModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                       leaveData.add((HRLeaveModel) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik HrLeaveinfo exe");

                }
            }
            
            
        else if (instance instanceof jobRecruitModel) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                       recruitData.add((jobRecruitModel) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik HrRecruitinfo exe");

                }
            }     
        
            
            
           else if (instance instanceof trainingModelClass) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                       tmcData.add((trainingModelClass) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik trainingwork exe");

                }
            }      
            
            
            
          
            
        else if (instance instanceof employeeSalaryDetails) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                     SalaryCalculator.add((employeeSalaryDetails) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik salaryCalculator exe");

                }
            }          
            
            
            
            
          else if (instance instanceof expensesTrackingSystemModelclass) {
                f = new File(fileName);
                fw = new FileInputStream(f);
                ois = new ObjectInputStream(fw);
                try {
                    while (true) {
                     expenseTracking.add((expensesTrackingSystemModelclass) ois.readObject());
                    }
                }catch (Exception e) {
                    System.out.println("Shamik expense tracking exe");

                }
            }              
            
            
            
            
     
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
                catch (Exception e) {
                    System.out.println("BAFUFE File");
                } finally {
                    try {
                        if (ois != null) {
                            ois.close();
                        }
                    } catch (IOException ex) {

                    }
                }

                if (instance instanceof timeAttendanceModel)return AttendanceData;
                else if (instance instanceof timePerformanceModel) return PerformanceData;
                else if ( instance instanceof Employee ) return employeeinfoData;
                else if ( instance instanceof PaySalariesModelClass ) return PaySalariesinfoData;
                else if ( instance instanceof incomeManagement ) return IncomeinfoData;
                else if ( instance instanceof HRLeaveModel ) return leaveData;
                else if ( instance instanceof jobRecruitModel ) return recruitData;
                else if ( instance instanceof trainingModelClass ) return tmcData;
                else if ( instance instanceof employeeSalaryDetails ) return SalaryCalculator;
                else if ( instance instanceof expensesTrackingSystemModelclass ) return expenseTracking;

                 
                
                return SData;
            }

    

    
    
    
    
    
    
    
    
    
    
    
     public static <T> Boolean overWriteObjectToFile(String fileName, T instance){
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        File f = null;
        try{
            f = new File(fileName);
            if (f.exists() ){
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            try {
                oos.writeObject(instance);
                oos.close();
                return true;
            }
            catch(IOException ex){
                GenerateAlerts.unsuccessfulAlert("Error while writing the File." + "\n" +
                                                "Please Check your Storage Efficiency, File type and name.");
            }
        }
        catch (Exception e){
            GenerateAlerts.unsuccessfulAlert("Data is Vulnerable." + "\n" + "Please try again rechecking your data" + 
                                                "If you can't solve the issue. Contact Software maintainer.");
        }
        finally {
            try{
                if ( oos != null){
                    oos.close();
                }
            }
            catch (IOException ex){
                GenerateAlerts.unsuccessfulAlert("Error while closing the Binary File.");
                return false;
            }
        } 
        return false;
        
    }
    
    
    }
