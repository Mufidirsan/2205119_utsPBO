package uts_pbo.soal4;

class LimasSegi4 {
   double luasAlas;
   double luasSelubungLimas;
   double tinggi;

  public LimasSegi4() {
    luasAlas = 0;
    luasSelubungLimas = 0;
    tinggi = 0;
  }

  public LimasSegi4(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
    luasAlas = luasAlasBaru;
    luasSelubungLimas = luasSelubungLimasBaru;
    tinggi = tinggiBaru;
  }

  public double getLuas() {
    return luasAlas + luasSelubungLimas;
  }

  public double getVolume() {
    return (1.0/3) * luasAlas * tinggi;
  }

  public void setLuasAlas(double luasAlasBaru) {
    luasAlas = luasAlasBaru;
  }

  public void setLuasSelubung(double luasSelubungLimasBaru) {
    luasSelubungLimas = luasSelubungLimasBaru;
  }

  public void setTinggi(double tinggiBaru) {
    tinggi = tinggiBaru;
  }
}
