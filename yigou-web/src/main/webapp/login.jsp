<head>
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery/jquery-1.4.min.js"></script>
</head>
<script type="text/javascript">
	 $.ajax({url:"http://localhost:8080/yigou-web/user/login",
	 	type:"post",
	 	contentType:"application/json",
 	dataType:"json",
  	data:JSON.stringify({_id:"0",userName:"1111",password:"2222222",status:"25"}),
  success:function(data,status){
    alert("Data: " + data + "\nStatus: " + status);
  },
  
  error:function(XMLHttpRequest, textStatus, errorThrown){
  	alert("error: " + XMLHttpRequest.status + "\nStatus: " + textStatus);
  }
  });
</script>