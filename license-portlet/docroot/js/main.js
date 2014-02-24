


function reloadPage() {
    location.reload(true);
    var url = document.URL;
    if(url.indexOf('?')!=-1){
        url =  url.substring(0, url.indexOf("?"));
    }
    location.href = url;

}