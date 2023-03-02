// BOJ 12605번 단어순서 뒤집기
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n; // 문장 개수
    cin >> n;
    cin.ignore(); // 입력버퍼 제거

    for(int i = 1; i <= n; i++){ // n만큼 반복
        string s;
        getline(cin, s); // 문장 입력받음
        reverse(s.begin(), s.end()); // 문장을 뒤집음
        int start = 0;
        for(int j = 0; j < s.size(); j++){
            if(s[j] == ' '){ // 공백일 때
                reverse(s.begin() + start, s.begin() + j); // start부터 j까지만 뒤집음
                start = j + 1; // start 갱신
            }
            else if(j == s.size() - 1){ // 문장의 끝일 때
                reverse(s.begin() + start, s.end()); // start부터 end까지 뒤집음
            }
        }
        cout << "Case #" << i << ": " << s << endl; // 출력
    }
    return 0;
}
