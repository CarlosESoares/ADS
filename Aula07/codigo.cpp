#include <iostream>
using namespace std;

int main(){
    float notas[3];

    for (int i = 0; i <3; i++){
        cout << "Digite a " << i+1 <<" nota: ";
        cin >> notas[i];
    }
    float media = 0; 
    for (int j = 0; j < 3; j++){
        media = media + notas[j];
    }   
    if(media / 3 < 7){
        cout <<"Aluno reprovado" << endl;
    }else {
        cout << "Aluno aprovado" << endl;
    }
    return 0;
}