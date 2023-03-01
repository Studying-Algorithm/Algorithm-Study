// BJ 17608번 막대기
#include <iostream>
using namespace std;

int main() {
    int n; // 막대기 개수
    cin >> n;

    int arr[n - 1]; // 막대기의 높이 담는 배열
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    int result = 1; // 마지막 막대기는 무조건 보이기 때문에 1로 시작
    int max = arr[n - 1]; // 마지막 막대기의 높이 넣음
    for(int i = n - 1; i >= 0; i--){ // 맨 뒤부터 탐색 시작
        if(arr[i] > max){ // max보다 큰 막대기
            result++; // result 증가
            max = arr[i]; // max에 현재 탐색한 원소 넣음
        }
    }

    cout << result; // 개수 리턴
}
