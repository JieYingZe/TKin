$(function () {
		var data=eval(document.getElementById("peopleDailyDataInfo").innerHTML);
        $('#peopleDaily').highcharts({
            chart: {
                type: 'spline'
            },
            title: {
                text: '日总人数统计'
            },
            xAxis: {
                type: 'datetime',
                dateTimeLabelFormats: { // don't display the dummy year
                    month: '%e. %b',
                    year: '%b'
                }
            },
            yAxis: {
                title: {
                    text: '日总人数 (人次)'
                },
                min: 0
            },
            tooltip: {
                formatter: function() {
                        return '<b>'+ this.series.name +'</b><br/>'+
                        Highcharts.dateFormat('%e. %b', this.x) +': '+ this.y +' people';
                }
            },
            legend: {
                enabled: false
            },
            credits: {
                enabled: false
            },
            series: [{
            	name: '日总人数 ',
            	data: data
            }]
        });
    });

$(function () {
	var data=eval(document.getElementById("peopleMonthlyDataInfo").innerHTML);
    $('#peopleMonthly').highcharts({
        chart: {
            type: 'spline'
        },
        title: {
            text: '月总人数统计'
        },
        xAxis: {
            type: 'datetime',
            dateTimeLabelFormats: { // don't display the dummy year
                month: '%b',
                year: '%b'
            }
        },
        yAxis: {
            title: {
                text: '月总人数 (人次)'
            },
            min: 0
        },
        tooltip: {
            formatter: function() {
                    return '<b>'+ this.series.name +'</b><br/>'+
                    Highcharts.dateFormat('%b', this.x) +': '+ this.y +' people';
            }
        },
        legend: {
            enabled: false
        },
        credits: {
            enabled: false
        },
        series: [{
        	name: '月总人数 ',
        	data: data
        }]
    });
});

$(function () {
		var categories=eval(document.getElementById("siteCategoriesInfo").innerHTML);
		var data=eval(document.getElementById("siteDataInfo").innerHTML);
        $('#site').highcharts({
            chart: {
                type: 'bar'
            },
            title: {
                text: '场地使用统计'
            },
            xAxis: {
                categories: categories,
            },
            yAxis: {
                min: 0,
                title: {
                    text: '人次',
                    align: 'high'
                },
                labels: {
                    overflow: 'justify'
                }
            },
            plotOptions: {
                bar: {
                    dataLabels: {
                        enabled: true
                    }
                }
            },
            legend: {
                enabled: false
            },
            credits: {
                enabled: false
            },
            series: [{
            	data: data
            }]
        });
    });

$(function () {
	var categories=eval(document.getElementById("coachCategoriesInfo").innerHTML);
	var data=eval(document.getElementById("coachDataInfo").innerHTML);
    $('#coach').highcharts({
        chart: {
            type: 'bar'
        },
        title: {
            text: '教练使用统计'
        },
        xAxis: {
            categories: categories,
        },
        yAxis: {
            min: 0,
            title: {
                text: '人次',
                align: 'high'
            },
            labels: {
                overflow: 'justify'
            }
        },
        plotOptions: {
            bar: {
                dataLabels: {
                    enabled: true
                }
            }
        },
        legend: {
            enabled: false
        },
        credits: {
            enabled: false
        },
        series: [{
        	data: data
        }]
    });
});