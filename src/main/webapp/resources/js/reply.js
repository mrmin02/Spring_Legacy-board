/**
 * 
 */

console.log("Reply Module ........");

var replyService = ( function(){
	
	function add(reply, callback, error){
		console.log("reply.......");
		$.ajax({
			type:'post',
			url : '/replies/new',
			data: JSON.stringify(reply),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr){
				if(callback){
					callback(result);
				}
			},
			error: function(xhr, status, er){
				if(error){
					error(er)
				}
			}
		});
	}
	
	function getList(param, callback, error){
		var bno = param.bno;
		var page = param.page || 1; // 페이지 값 있으면, 그거 사용  or 페이지 값이 없으면, 1 로 설정, 
		
//		$.ajax({
//			type: 'get',
//			url : '/replies/pages'+bno+"/"+page,
//			data: JSON.stringify(reply),
//			contentType : "application/json; charset=utf-8",
//			success : function(result, status, xhr){
//				if(callback){
//					callback(result);
//				}
//			},
//			error: function(xhr, status, er){
//				if(error){
//					error(er)
//				}
//			}
//		})
		
		
		$.getJSON("/replies/pages/"+bno+"/"+page+".json", function(data){
			if(callback){
				callback(data);
			}
		}).fail(function(xhr, status, err){
			if(error){
				error(err)
			}
		});
	}
	
	
	return {add:add, getList: getList};
	
})();