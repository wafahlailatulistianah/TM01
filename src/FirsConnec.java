import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

class FirstConnect {
        public static void main(String[] args) throws IOException {
            ConnectURI koneksisaya = new ConnectURI();
            URL myAddress = koneksisaya.buildURL
                    ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAelGtM");
            String response = koneksisaya.getresponseFromHttpUrl(myAddress);
            System.out.println(response);
            assert response != null;
            JSONArray responseJSON = new JSONArray(response);
            ArrayList<Barang.ResponseModel> responseModel =
                    new ArrayList<>();
            for (int i = 0; i < responseJSON.length(); i++) {
                Barang.ResponseModel resModel = new Barang.ResponseModel();
                JSONObject myJSONObject =
                        responseJSON.getJSONObject(i);
                resModel.setMassagge(myJSONObject).getString("massagge");
                resModel.setStatus(myJSONObject).getStatus("status");
                resModel.setComment(myJSONObject).getComment("Comment");
                responseModel.add(resModel);
            }

            System.out.println("Response are");
            for (int index = 0; index < responseModel.size(); index++) {
                System.out.println("MASSAGGE : " +
                        responseModel.get(index).getMassagge());
                System.out.println("STATUS : " +
                        responseModel.get(index).getStatus());
                System.out.println("COMMENT : " +
                        responseModel.get(index).getComment());
            }
        }

    private class JSONArray {
    }

    public int length() {


        public JSONObject getJSONObject(int i)}
}

private class ResponseModel {
    public String getMassagge() {


    }
    }

