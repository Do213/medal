#include<iostream>
using namespace std;

int main()
{
int password;
string name, surname, status;
long student_ID, keen;
     for(int k=0;k<=2;k++){
     
cout << "enter your password\n";
cin>>password;

if(password==7644)
{
cout << "you've entered the correct password" << endl;
cout<< endl;
cout << "enter your student ID" << endl;
cin>>student_ID;
cout << "enter your name" << endl;
cin>>name;
cout << "enter your surname" << endl;
cin>>surname;
cout << "enter your next of keen" << endl;
cin>>keen;
cout << "enter your scholarship status" << endl;
cin>>status;
cout<< endl;

cout << " Student ID.       : "<<student_ID << endl;
cout << " Name.             : " <<name<< endl;
cout << " Surname           : " <<surname<< endl;
cout << " Next of keen.     : "<<keen<< endl;
cout << " Scholarship status: " <<status<< endl;
}
else
{cout << "you've entered a wrong password!" << endl;
}
}
cout<<"Goodbye"<<endl;

    return 0;
    
}