print('=== Nama dan Umur ===')
name = []
age = []

print('\nData Nama')
nm = 0
while nm < 3:
    try:
        namai = input('Masukan Nama Kamu : ')
        nm += 1
    except:
        print('Oops! Masukan Ulang Nama Kamu')
    else:
        name.append(namai)
    finally:
        print(f'Nama ke-{nm} Berhasil Dimasukan.')
print('Data Kamu Tersimpan Dalam File "nama.txt"\n')

print('Data Umur')
ag = 0
while ag < 3:
    try:
        agi = int(input('Masukan Umur Kamu! : '))
        ag += 1
    except ValueError:
        print('Oops! Masukan Ulang Umur Kamu')
    else:
        age.append(agi)
    finally:
        print(f'Data Umur ke-{ag} Berhasil Dimasukan.')
print('Data Kamu Tersimpan Dalam File "umur.txt"')
print('Semua Data Kamu Tergabung Dalam File "namaumur.txt"\n')

nfile = open('nama.txt','w')
ufile = open('umur.txt','w')
mix = open('namaumur.txt','w')

nfile.write(str(name))
ufile.write(str(age))

for i in range(3):
    mix.write(f'Nama : {name[i]}, Umur : {age[i]} | ')
print('=== Terimakasih Sudah Menggunakan Program Kami ===')