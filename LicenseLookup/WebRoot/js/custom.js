/*
 * Shows a div with an ajax loading message. 
 * params:  parentId  The div that will show the loading message and then the loaded page.  
 * 
 * Usage: 
 *        showLoadingMessage("parentId");
 *        $("#parentId").load("somePage.jsp");
 *        
 */
function showLoadingMessage(parentIdName) {
  $("#" + parentIdName).html('<div class="loadingMessage"><img class="loadingMessageImg" src="images/ajax-loader.gif" /><br />Loading</div>');
}

