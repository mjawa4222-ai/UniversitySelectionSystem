public class Campus {
        private String campusName;
        private String city;
        private String address;
        private boolean isMainCampus;
        private String universityName;

        public Campus(String campusName,
                      String city,
                      String address,
                      boolean isMainCampus,
                      String universityName) {
            this.campusName = campusName;
            this.city = city;
            this.address = address;
            this.isMainCampus = isMainCampus;
            this.universityName = universityName;
        }

        public String getCampusName() {
            return campusName;
        }

        public String getCity() {
            return city;
        }

        public String getAddress() {
            return address;
        }

        public boolean isMainCampus() {
            return isMainCampus;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setCampusName(String campusName) {
            this.campusName = campusName;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setMainCampus(boolean mainCampus) {
            isMainCampus = mainCampus;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }
}
