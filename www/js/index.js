const app = {
	initialize: function() {
		document.addEventListener('deviceready');
		this.toastInit();
	} ,

	onDeviceReady: function() {
		this.receivedEvent('deviceready');
		this.toastInit();
	}, 

	// receivedEvent: function
}
