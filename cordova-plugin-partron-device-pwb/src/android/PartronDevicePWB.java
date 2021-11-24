package cordova.plugin.partron.device.pwb;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 파트론 PWB 통합 Cordova 핸들러 클래스
 */
public class PartronDevicePWB extends CordovaPlugin {
        /**
         * 실행 Entry Point 메서드
         * @param action          넘겨받은 action 문자
         * @param args            파라미터
         * @param callbackContext 콜백
         */
        @Override
        public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
                // 테스트 Toast 메서드
                if (action.equals("toast")) {
                        String message = args.getString(0);
                        Toast.makeText(cordova.getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                        callbackContext(String.format("Toast Message:%s", message));
                }
                return false;
        }
}
