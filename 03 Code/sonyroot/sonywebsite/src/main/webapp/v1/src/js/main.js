/* ������ģ����� */
var ContentMode = React.createClass({
        render: function(){
            return (
                <div className="ContentMode">
                    <div class="contents">{this.props.contents}</div>
                    {this.props.children}
                </div>
            )
        }
});
/* ҳ��div��װ ��������ģ�� */
var Page = React.createClass({
    render: function(){
        return (
            <div className="homepage">
                <ContentMode  contents ="longen">this is one comment</ContentMode >
                <ContentMode  contents ="longen2">this is two comment</ContentMode >
            </div>
            )
        }
});
/* ��ʼ����content������ */
React.render(
       React.createElement(Page,null),document.getElementById("content")
);