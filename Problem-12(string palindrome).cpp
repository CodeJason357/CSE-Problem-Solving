#include<iostream>
#include<string>
#include<cctype>
using namespace std;

// Function to remove spaces
string removeSpaces(string s) {
    string result = "";
    for(char c : s) {
        if(c != ' ') result += c;
    }
    return result;
}

// Function to convert to lowercase
string toLowerCase(string s) {
    string result = "";
    for(char c : s) {
        result += tolower(c);
    }
    return result;
}
int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);  // full line input

    // Step 1: remove spaces
    str = removeSpaces(str);

    // Step 2: convert to lowercase
    str = toLowerCase(str);

    // Step 3: Palindrome check
    bool isPalindrome = true;
    int len = str.length();  // corrected from length.result

    for(int i = 0; i < len; i++) {
        for(int j = len - 1 - i; j < len; j++) {
            if(str[i] != str[j]) {
                isPalindrome = false;  // corrected from Palindrome
                break;
            }
        }
    }

    if(isPalindrome) {
        cout << "Palindrome" << endl;
    } else {
        cout << "Not Palindrome" << endl;
    }

    return 0;
}