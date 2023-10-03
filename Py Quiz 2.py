nama = input('Masukan Nama Pembeli : ')
barang1 = input('Masukan Nama Barang ke-1 : ')
harga1 = int(input('Masukan Harga Barang ke-1 : '))
barang2 = input('Masukan Nama Barang ke-2 : ')
harga2 = int(input('Masukan Harga Barang ke-2 : '))

if(barang1 == 'minyak'):
    diskon_harga1 = harga1*(10/100)
    harga1 = harga1 - diskon_harga1
    print('Harga Diskon Minyak', harga1)
if(barang2 == 'minyak'):
    diskon_harga2 = harga2*(10/100)
    harga2 = harga2 - diskon_harga2

total = harga1+harga2

if(total >= 200000):
    diskon = total*(5/100)
    print('Harga Diskon Total', diskon)
    total = total - diskon
    print('Total Harga Yang Anda Bayar', total)
else:
    print('Total Harga Yang Anda Bayar', total)