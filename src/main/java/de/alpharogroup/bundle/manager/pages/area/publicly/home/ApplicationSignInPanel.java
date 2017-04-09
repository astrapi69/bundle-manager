package de.alpharogroup.bundle.manager.pages.area.publicly.home;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;

import de.alpharogroup.bundle.manager.pages.area.app.DashboardPage;
import de.alpharogroup.wicket.components.sign.in.SignInWithRedirectionBean;
import de.alpharogroup.wicket.components.sign.in.form.SigninFormPanel;

public class ApplicationSignInPanel extends GenericPanel<SignInWithRedirectionBean> {

	private static final long serialVersionUID = 1L;

	public ApplicationSignInPanel(String id, IModel<SignInWithRedirectionBean> model) {
		super(id, model);
		add(newSigninFormPanel("horizontalFormPanel", model));
	}

	protected Component newSigninFormPanel(final String id,
		final IModel<SignInWithRedirectionBean> model) {
		final SigninFormPanel<SignInWithRedirectionBean> signFormPanel = new SigninFormPanel<SignInWithRedirectionBean>(
				id, new CompoundPropertyModel<>(model)){

					private static final long serialVersionUID = 1L;

					@Override
					protected void onPasswordForgotten(AjaxRequestTarget target, Form<?> form) {
						ApplicationSignInPanel.this.onPasswordForgotten(target, form);
					}

					@Override
					protected void onSignin(AjaxRequestTarget target, Form<?> form) {
						ApplicationSignInPanel.this.onSignin(target, form);
					}

					@Override
					protected void onError(AjaxRequestTarget target, Form<?> form) {
						ApplicationSignInPanel.this.onError(target, form);
					}
			
		};
		return signFormPanel;
	}
	

	protected void onPasswordForgotten(AjaxRequestTarget target, Form<?> form) {
		// TODO Auto-generated method stub
		
	}

	protected void onSignin(AjaxRequestTarget target, Form<?> form) {
		// TODO signin process
		SignInWithRedirectionBean signInWithRedirectionBean = getModelObject();
		setResponsePage(DashboardPage.class);		
	}

	protected void onError(AjaxRequestTarget target, Form<?> form) {
		// TODO Auto-generated method stub
		
	}
}
