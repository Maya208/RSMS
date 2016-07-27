jQuery(document).ready(function(){
			
       jQuery("a[data-gal^='prettyPhoto']").prettyPhoto({
            animationSpeed: 'normal',
            padding: 40,
            opacity: 0.35,
            showTitle: true,
            allowresize: true,
            counter_separator_label: '/',          
            theme: 'facebook' 
        });
        jQuery('.sidebar .block:last').addClass ('last_block'); 
		if(jQuery.browser.safari) { jQuery( function() { jQuery('body').addClass('safari-fix'); } ); };
});

