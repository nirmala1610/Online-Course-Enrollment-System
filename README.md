# Online Course Enrollment System 🎓

## Problem Statement
Design and implement a **Java console application** for a Course Enrollment System that handles:
- Courses  
- Instructors  
- Students (Normal & Premium)  
- Enrollments  
- Payments  
- Receipts  

### Business Rules
1. Students can only enroll in available courses.  
2. Premium students may get fee discounts or access to extra materials.  
3. Payment must be completed for enrollment confirmation.  
4. Enrollment should update course capacity.  
5. Each receipt must link to a student and a course.  

### Console Interface Features
- Add Course  
- Add Student  
- Enroll in Course  
- Make Payment  
- Display Courses  
- Exit  

---

## Project Structure
com.kce.courseenrollment.model # Contains Course, Student, PremiumStudent, Instructor, Enrollment, Payment, Receipt
com.kce.courseenrollment.service # Business logic classes (CourseService, StudentService, EnrollmentService, PaymentService)
com.kce.courseenrollment.exception # Custom exception (InvalidEnrollmentException)
com.kce.courseenrollment.main # Entry point (CourseEnrollmentSystem.java)

## How to Compile & Run

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/course-enrollment-system.git
cd course-enrollment-system
2. Open in Eclipse
Open Eclipse IDE

Go to File > Import > Existing Projects into Workspace

Select the cloned project folder

Finish

3. Run
Navigate to com.kce.courseenrollment.main.CourseEnrollmentSystem

Right-click → Run As > Java Application

```
Sample Output Screenshots
<img width="1107" height="244" alt="image" src="https://github.com/user-attachments/assets/804a21d0-fb45-4ec3-aa96-5159b48ba7d9" />
<img width="1113" height="266" alt="image" src="https://github.com/user-attachments/assets/f191b36c-cd44-4a0f-ac5b-9575ca06abaf" />
<img width="1091" height="254" alt="image" src="https://github.com/user-attachments/assets/bb5a5873-cbeb-4fec-b381-df3c42334e05" />
<img width="1093" height="244" alt="image" src="https://github.com/user-attachments/assets/e9d3498b-2e35-4e81-bd13-82519389710e" />
<img width="1087" height="292" alt="image" src="https://github.com/user-attachments/assets/7d3ddebc-7483-4b36-9556-ff7baebe4212" />
<img width="1085" height="317" alt="image" src="https://github.com/user-attachments/assets/e53dd601-5ee1-4ef5-a253-e7a9b3815b90" />


### Student Details
Name: NIRMALADEVI S

Roll No.: 717823P235
