var EditableTable = function () {

    return {

        //main function to initiate the module
        init: function () {
            function restoreRow(oTable, nRow) {
                var aData = oTable.fnGetData(nRow);
                var jqTds = $('>td', nRow);

                for (var i = 0, iLen = jqTds.length; i < iLen; i++) {
                    oTable.fnUpdate(aData[i], nRow, i, false);
                }

                oTable.fnDraw();
            }

            function editRow(oTable, nRow) {
                var aData = oTable.fnGetData(nRow);
                var jqTds = $('>td', nRow);
                jqTds[0].innerHTML = '<input type="text" class="form-control small" value="' + aData[0] + '">';
                jqTds[1].innerHTML = '<input type="text" class="form-control small" value="' + aData[1] + '">';
                jqTds[2].innerHTML = '<input type="text" class="form-control small" value="' + aData[2] + '">';
                jqTds[3].innerHTML = '<input type="text" class="form-control small" value="' + aData[3] + '">';
                jqTds[4].innerHTML = '<input type="text" class="form-control small" value="' + aData[3] + '">'; //加上去的
                jqTds[5].innerHTML = '<a class="edit" href="">Save</a>';
                jqTds[6].innerHTML = '<a class="cancel" href="">Cancel</a>';
            }

            function saveRow(oTable, nRow) {
                var jqInputs = $('input', nRow);
                oTable.fnUpdate(jqInputs[0].value, nRow, 0, false);
                oTable.fnUpdate(jqInputs[1].value, nRow, 1, false);
                oTable.fnUpdate(jqInputs[2].value, nRow, 2, false);
                oTable.fnUpdate(jqInputs[3].value, nRow, 3, false);
                oTable.fnUpdate(jqInputs[4].value, nRow, 4, false); //这行是加上去的
                var url = "http://cos.cainsyake.com.cn/" + jqInputs[2].value + "/" + jqInputs[1].value;
                oTable.fnUpdate('<a target="_blank" href=url>下载</a>', nRow, 5, false);    //第三个参数由4改成5
                oTable.fnUpdate('<a class="delete" href="">删除</a>', nRow, 6, false);    //第三个参数由5改成6
                oTable.fnDraw();

                /**
                 * 在这里增加一个ajax测试节点

                for(var i=0; i<5; i++){
                    alert("循环获取测试:" + jqInputs[i].value);    //这行代码可以获取到第i个元素
                }
                 */
                var checkStatus = true;
                for(var i=1; i<4; i++){
                    if(jqInputs[i].value==""){
                        console.log(i + " 次检验结果为假");
                        checkStatus = false;
                    }
                }
                if(checkStatus){
                    console.log("可以执行Ajax操作");
                    $.ajax({
                        url:"/fileAdd",
                        type:'POST',
                        data:{
                            name:jqInputs[1].value,
                            kind:jqInputs[2].value,
                            version:jqInputs[3].value,
                            uploader:jqInputs[4].value
                        },
                        // success: function (response, xml) {
                        //     alert("节点测试2:AJAX操作成功" );
                        // },
                        // fail: function (status) {
                        //     alert("节点测试3:AJAX操作失败" );
                        // }
                        success:function(data,status){ //请求成功的回调函数

                            if(status=="success"){
                                // console.log(status);
                                // console.log(data);
                                // var ot = data;
                                // console.log("提取：" + ot.name);

                            }
                        }
                    });

                }else{
                    alert("数据库插入失败，请勿输入空值！");
                }


                // alert("Test2:" + nRow.cell[0].innerHTML);   //这行代码无反应
                // for(var j=0; j<7; j++){
                //     alert("新增节点测试2："+ nRow.cells[j].innerHTML);
                // }
            }

            function cancelEditRow(oTable, nRow) {
                var jqInputs = $('input', nRow);
                oTable.fnUpdate(jqInputs[0].value, nRow, 0, false);
                oTable.fnUpdate(jqInputs[1].value, nRow, 1, false);
                oTable.fnUpdate(jqInputs[2].value, nRow, 2, false);
                oTable.fnUpdate(jqInputs[3].value, nRow, 3, false);
                oTable.fnUpdate('<a class="edit" href="">Edit</a>', nRow, 4, false);
                oTable.fnDraw();
            }

            var oTable = $('#editable-sample').dataTable({
                "aLengthMenu": [
                    [5, 15, 20, -1],
                    [5, 15, 20, "All"] // change per page values here
                ],
                // set the initial value
                "iDisplayLength": 5,
                "sDom": "<'row'<'col-lg-6'l><'col-lg-6'f>r>t<'row'<'col-lg-6'i><'col-lg-6'p>>",
                "sPaginationType": "bootstrap",
                "oLanguage": {
                    "sLengthMenu": "_MENU_ records per page",
                    "oPaginate": {
                        "sPrevious": "Prev",
                        "sNext": "Next"
                    }
                },
                "aoColumnDefs": [{
                        'bSortable': false,
                        'aTargets': [0]
                    }
                ]
            });

            jQuery('#editable-sample_wrapper .dataTables_filter input').addClass("form-control medium"); // modify table search input
            jQuery('#editable-sample_wrapper .dataTables_length select').addClass("form-control xsmall"); // modify table per page dropdown

            var nEditing = null;

            $('#editable-sample_new').click(function (e) {
                e.preventDefault();
                var aiNew = oTable.fnAddData(['', '', '', '', '', '<a class="edit" href="">Edit</a>', '<a class="cancel" data-mode="new" href="">Cancel</a>']); //这是新建，然后按cancel的输出结果
                var nRow = oTable.fnGetNodes(aiNew[0]);

                // for(var j=0; j<7; j++){
                //     alert(nRow.cells[j].innerHTML);  //这里获取到的是<input>语句
                // }

                editRow(oTable, nRow);
                nEditing = nRow;
            });

            $('#editable-sample a.delete').live('click', function (e) {
                e.preventDefault();

                if (confirm("确定删除这行吗?") == false) {
                    return;
                }

                var nRow = $(this).parents('tr')[0];
                // for(var j=0; j<7; j++){
                //     alert(nRow.cells[j].innerHTML);
                // }
                // alert("节点测试：" +  nRow.cells[7].innerHTML);

                /** 只删除而不记录操作者
                var deleteId = nRow.cells[0].innerHTML;
                $.ajax({
                    url:"/fileDelete/"+deleteId,
                    type:'DELETE',
                    success: function (response, xml) {
                        alert("节点测试2:AJAX操作成功" );
                    },
                    fail: function (status) {
                        alert("节点测试3:AJAX操作失败" );
                    }
                });
                 */

                /**
                 *记录删除操作者的方法
                 */
                var deleteId = nRow.cells[0].innerHTML;
                var deleteUser = nRow.cells[7].innerHTML;
                var deleteStatus = $.ajax({
                    url:"/tabDelete/"+deleteId+"/"+deleteUser,
                    type:'DELETE',
                    success: function (status) {
                        alert("状态：" + status);
                    },
                    fail: function (status) {
                        alert("状态：" + status);
                    }
                });
                // var str = JSON.stringify(deleteStatus);  //抓取ajax返回状态信息
                // var str2 = deleteStatus.readyState;
                // alert(str);
                // alert(str2);





                oTable.fnDeleteRow(nRow);
                // alert("Deleted! Do not forget to do some ajax to sync with backend :)");
                alert("删除成功！");
            });

            $('#editable-sample a.deleteUser').live('click', function (e) {
                e.preventDefault();

                if (confirm("确定删除这个用户吗?") == false) {
                    return;
                }

                var nRow = $(this).parents('tr')[0];
                for(var j=0; j<5; j++){
                    alert(nRow.cells[j].innerHTML);
                }
                // alert("节点测试：" +  nRow.cells[7].innerHTML);

                /** 只删除而不记录操作者
                 var deleteId = nRow.cells[0].innerHTML;
                 $.ajax({
                    url:"/fileDelete/"+deleteId,
                    type:'DELETE',
                    success: function (response, xml) {
                        alert("节点测试2:AJAX操作成功" );
                    },
                    fail: function (status) {
                        alert("节点测试3:AJAX操作失败" );
                    }
                });
                 */

                /**
                 *记录删除操作者的方法
                 */
                // var deleteId = nRow.cells[0].innerHTML;
                // var deleteUser = nRow.cells[7].innerHTML;
                // var deleteStatus = $.ajax({
                //     url:"/tabDelete/"+deleteId+"/"+deleteUser,
                //     type:'DELETE',
                //     success: function (status) {
                //         alert("状态：" + status);
                //     },
                //     fail: function (status) {
                //         alert("状态：" + status);
                //     }
                // });
                // var str = JSON.stringify(deleteStatus);  //抓取ajax返回状态信息
                // var str2 = deleteStatus.readyState;
                // alert(str);
                // alert(str2);
                oTable.fnDeleteRow(nRow);
                // alert("Deleted! Do not forget to do some ajax to sync with backend :)");
                alert("删除成功！");
            });


            $('#editable-sample a.cancel').live('click', function (e) {
                e.preventDefault();
                if ($(this).attr("data-mode") == "new") {
                    var nRow = $(this).parents('tr')[0];
                    oTable.fnDeleteRow(nRow);
                } else {
                    restoreRow(oTable, nEditing);
                    nEditing = null;
                }
            });

            $('#editable-sample a.edit').live('click', function (e) {
                e.preventDefault();

                /* Get the row as a parent of the link that was clicked on */
                var nRow = $(this).parents('tr')[0];

                if (nEditing !== null && nEditing != nRow) {
                    /* Currently editing - but not this row - restore the old before continuing to edit mode */
                    restoreRow(oTable, nEditing);
                    editRow(oTable, nRow);
                    nEditing = nRow;
                } else if (nEditing == nRow && this.innerHTML == "Save") {
                    /* Editing this row and want to save it */
                    saveRow(oTable, nEditing);
                    nEditing = null;
                    // alert("Updated! Do not forget to do some ajax to sync with backend :)");
                    alert("保存成功！");
                } else {
                    /* No edit in progress - let's start one */
                    editRow(oTable, nRow);


                    nEditing = nRow;
                }
            });
        }

    };

}();